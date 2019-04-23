package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002373;

/**
 * A020481.
 * @author Sean A. Irvine
 */
public class A020481 extends PrependSequence {

  /** Construct the sequence. */
  public A020481() {
    super(new A002373(), Z.TWO);
  }
}
