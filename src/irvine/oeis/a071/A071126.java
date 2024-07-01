package irvine.oeis.a071;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002371;

/**
 * A060316.
 * @author Sean A. Irvine
 */
public class A071126 extends PrependSequence {

  /** Construct the sequence. */
  public A071126() {
    super(1, new A002371().skip(2), 0, 3);
  }
}
