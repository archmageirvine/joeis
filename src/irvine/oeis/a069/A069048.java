package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007908;

/**
 * A069048 Numbers k such that (i) k is a concatenation of consecutive natural numbers starting at 1 and (ii) k+1 is prime.
 * @author Sean A. Irvine
 */
public class A069048 extends FilterSequence {

  /** Construct the sequence. */
  public A069048() {
    super(1, new A007908(), k -> k.add(1).isProbablePrime());
  }
}

