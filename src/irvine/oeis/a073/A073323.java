package irvine.oeis.a073;

import irvine.oeis.InverseSequence;
import irvine.oeis.PrependSequence;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073323 extends PrependSequence {

  /** Construct the sequence. */
  public A073323() {
    super(1, new InverseSequence(new A073259(), 3), 0, 0);
  }
}

