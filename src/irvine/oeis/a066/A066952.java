package irvine.oeis.a066;

import irvine.oeis.InverseSequence;
import irvine.oeis.a072.A072410;

/**
 * A066952 Smallest m such that A072410(m) = n.
 * @author Sean A. Irvine
 */
public class A066952 extends InverseSequence {

  /** Construct the sequence. */
  public A066952() {
    super(0, new A072410(), 0);
  }
}
