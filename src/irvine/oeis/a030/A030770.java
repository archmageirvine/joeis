package irvine.oeis.a030;

import irvine.oeis.InverseSequence;

/**
 * A030770 a(n) = least k such that s(k) = n, where s = A030767.
 * @author Sean A. Irvine
 */
public class A030770 extends InverseSequence {

  /** Construct the sequence. */
  public A030770() {
    super(new A030767());
  }
}
