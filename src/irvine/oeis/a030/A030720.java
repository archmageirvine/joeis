package irvine.oeis.a030;

import irvine.oeis.InverseSequence;

/**
 * A030720 a(n)=least k such that s(k)=n, where s=A030717.
 * @author Sean A. Irvine
 */
public class A030720 extends InverseSequence {

  /** Construct the sequence. */
  public A030720() {
    super(new A030717());
  }
}
