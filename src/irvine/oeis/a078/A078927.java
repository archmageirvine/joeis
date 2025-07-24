package irvine.oeis.a078;

import irvine.oeis.InverseSequence;

/**
 * A078927 Smallest s for which there are exactly n primitive Pythagorean triangles with perimeter 2s; i.e., smallest s such that A078926(s) = n.
 * @author Sean A. Irvine
 */
public class A078927 extends InverseSequence {

  /** Construct the sequence. */
  public A078927() {
    super(1, new A078926(), 1);
  }
}
