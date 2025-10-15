package irvine.oeis.a076;

import irvine.oeis.InverseSequence;
import irvine.oeis.a061.A061498;

/**
 * A076362 Smallest x such that A061498(x)=n: least number in dRRS of which n distinct term occur.
 * @author Sean A. Irvine
 */
public class A076362 extends InverseSequence {

  /** Construct the sequence. */
  public A076362() {
    super(0, 0, new A061498());
  }
}
