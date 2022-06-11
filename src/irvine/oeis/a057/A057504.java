package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057504 Signature-permutation of the inverse of Deutsch's 1998 bijection on Dyck paths.
 * @author Sean A. Irvine
 */
public class A057504 extends InverseSequence {

  /** Construct the sequence. */
  public A057504() {
    super(new A057503(), 0, 0);
  }
}
