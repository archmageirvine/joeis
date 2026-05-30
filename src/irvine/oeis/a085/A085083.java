package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085083 Index of the first occurrence of n in A085082. Smallest number having divisors with n distinct prime signatures.
 * @author Sean A. Irvine
 */
public class A085083 extends InverseSequence {

  /** Construct the sequence. */
  public A085083() {
    super(1, new A085082());
  }
}
