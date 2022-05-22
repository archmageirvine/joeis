package irvine.oeis.a030;

import irvine.oeis.InverseSequence;

/**
 * A030730 Least k such that s(k)=n, where s=A030727.
 * @author Sean A. Irvine
 */
public class A030730 extends InverseSequence {

  /** Construct the sequence. */
  public A030730() {
    super(new A030727());
  }
}
