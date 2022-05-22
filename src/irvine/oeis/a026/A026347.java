package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026347 a(n) = least k such that s(k) = n, where s = A026346.
 * @author Sean A. Irvine
 */
public class A026347 extends InverseSequence {

  /** Construct the sequence. */
  public A026347() {
    super(new A026346());
  }
}
