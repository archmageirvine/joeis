package irvine.oeis.a348;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348634 Number of transitive relations on an n-set with exactly five ordered pairs.
 * @author Georg Fischer
 */
public class A348634 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348634() {
    super(0, "[[0],[0,4608,-9060,7581,-3481,965,-167,17,-1],[77640,-144287,116749,-53918,15656,-2960,362,-27,1]]", "[0,0,0,27]", 0);
  }
}
