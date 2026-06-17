package irvine.oeis.a014;

import irvine.oeis.a392.A392325;

/**
 * A014575 Vampire numbers (definition 2): numbers n with an even number of digits which have a factorization n = i*j where i and j have the same number of digits and the multiset of the digits of n coincides with the multiset of the digits of i and j.
 * @author Sean A. Irvine
 */
public class A014575 extends A392325 {

  /** Construct the sequence. */
  public A014575() {
    super(10, 1260);
  }
}
