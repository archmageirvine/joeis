/*
 * Redberry: symbolic tensor computations.
 *
 * Copyright (c) 2010-2015:
 *   Stanislav Poslavsky   <stvlpos@mail.ru>
 *   Bolotin Dmitriy       <bolotin.dmitriy@gmail.com>
 *
 * This file is part of Redberry.
 *
 * Redberry is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Redberry is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Redberry. If not, see <http://www.gnu.org/licenses/>.
 */
package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

import irvine.math.set.IntegerPermutation;

/**
 * This class holds <i>i</i>-th base point (<code>&beta;<sub>i</sub></code>), generators of
 * <code>G<sup>(i)</sup> = G<sub>&beta;<sub>1</sub>&beta;<sub>2</sub>...&beta;<sub>i-1</sub></sub></code> -
 * stabilizer of all base points from 0th to (<i>i</i>-1)-th as described in Sec. 4.4.1 in <b>[Holt05]</b>.
 * <p/>
 * Additionally it provides access to <code>&Delta;<sup>(i)</sup></code> - the orbit of <code>&beta;<sub>i</sub></code> under
 * <code>G<sup>(i)</sup></code>, right transversals of <code>H<sup>(i)</sup><sub>&beta;<sub>i</sub></sub></code> - stabilizer of
 * <code>&beta;<sub>i</sub></code> in <code>G<sup>(i)</sup></code>. This access is based on Schreier vector as described in Sec.
 * 4.1.1 of <b>[Holt05]</b>.
 *
 * @author Dmitry Bolotin
 * @author Stanislav Poslavsky
 */
public class BaseStrongGeneratingElement {
  /**
   * <i>i</i>-th base point (<code>&beta;<sub>i</sub></code>)
   */
  protected final int mBasePoint;
  /**
   * Generators of <code>G<sup>(i)</sup> = G<sub>&beta;<sub>1</sub>&beta;<sub>2</sub>...&beta;<sub>i-1</sub></sub></code> -
   * stabilizer of all base points from 0th to (<i>i</i>-1)-th as described in Sec. 4.4.1 in <b>[Holt05]</b>
   */
  protected final List<IntegerPermutation> mStabilizerGenerators;
  /**
   * Schreier vector that encodes information about stabilizer.
   */
  protected final SchreierArray mSchreierArray;
  /**
   * List of orbit points.
   */
  protected final ArrayList<Integer> mOrbitList;
  /**
   * Maximum internal degrees of stabilizers.
   */
  protected int mInternalDegree;


  BaseStrongGeneratingElement(final int basePoint, final List<IntegerPermutation> stabilizerGenerators, final SchreierArray schreierArray, final ArrayList<Integer> orbitList) {
    mBasePoint = basePoint;
    mStabilizerGenerators = stabilizerGenerators;
    mSchreierArray = schreierArray;
    mOrbitList = orbitList;
    mInternalDegree = IntegerPermutation.degree(stabilizerGenerators);
  }

  /**
   * Returns a reference to the list of stabilizers.
   * @return reference to the list of stabilizers
   */
  public List<IntegerPermutation> getStabilizerGeneratorsReference() {
    return mStabilizerGenerators;
  }

  /**
   * Calculates the transversal of specified point (<code>u<sub>&beta;</sub></code>); i.e., the element
   * <code>u<sub>&beta;</sub></code> such that <code>&beta;<sub>i</sub><sup>u<sub>&beta;</sub></sup> =  &beta;</code>.
   * @param point point
   * @return element that maps this base point to the specified point.
   * @see #getInverseTransversalOf(int)
   */
  public IntegerPermutation getTransversalOf(final int point) {
    final IntegerPermutation transversal = getInverseTransversalOf(point).inverse();
    assert transversal.image(mBasePoint) == point;
    return transversal;
  }

  /**
   * Calculates the inverse transversal corresponding to the specified point (<code>u<sub>&beta;</sub></code>); i.e., the element
   * <code>u<sub>&beta;</sub><sup>(-1)</sup></code> such that <code>&beta;<sub>i</sub><sup>u<sub>&beta;</sub></sup> =  &beta;</code>.
   * @param point point
   * @return inverse of the element that maps this base point to the specified point.
   */
  public IntegerPermutation getInverseTransversalOf(final int point) {
    if (mSchreierArray.get(point) == -2) {
      throw new IllegalArgumentException("Specified point does not belong to orbit of this base element.");
    }
    IntegerPermutation temp = IntegerPermutation.identity(mSchreierArray.length());
    while (mSchreierArray.get(temp.image(point)) != -1) {
      //System.out.println(temp);
      temp = temp.compose(mStabilizerGenerators.get(mSchreierArray.get(temp.image(point))).inverse());
    }
    return temp;
  }

  /**
   * Returns an immutable representation of this BSGS element
   * @return immutable representation of this BSGS element
   */
  public BaseStrongGeneratingElement asBaseStrongGeneratingElement() {
    return this;
  }

  /**
   * Returns true if specified point belongs to the orbit of this <code>&beta;<sub>i</sub></code>.
   * @param point point to test
   * @return true if specified point belongs to the orbit of this <code>&beta;<sub>i</sub></code>.
   */
  public boolean belongsToOrbit(final int point) {
    return mSchreierArray.get(point) != -2;
  }

  /**
   * Returns a mutable copy of this BSGS element.
   * @return a mutable copy of this BSGS element
   */
  public BaseStrongGeneratingCandidateElement asBaseStrongGeneratingCandidateElement() {
    return new BaseStrongGeneratingCandidateElement(mBasePoint, new ArrayList<>(mStabilizerGenerators), mSchreierArray.length());
  }

  /**
   * Returns size of orbit.
   * @return size of orbit
   */
  public int orbitSize() {
    return mOrbitList.size();
  }

  /**
   * Returns <i>i-th</i> point in orbit.
   * @param i position in orbit
   * @return <i>i-th</i> point in orbit
   */
  public int getOrbitPoint(final int i) {
    return mOrbitList.get(i);
  }

  int internalDegree() {
    return mInternalDegree;
  }

  @Override
  public String toString() {
    return "[" + mBasePoint + ", " + mStabilizerGenerators + "]";
  }
}
