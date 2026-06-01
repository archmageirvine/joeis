package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085095 Index of first occurrence of n in A085094.
 * @author Sean A. Irvine
 */
public class A085095 extends InverseSequence {

  /** Construct the sequence. */
  public A085095() {
    super(1, new A085094());
  }
}

