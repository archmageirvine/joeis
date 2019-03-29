package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A019590.
 * @author Sean A. Irvine
 */
public class A019590 extends PrependSequence {

  /** Construct the sequence. */
  public A019590() {
    super(new A000004(), Z.ONE, Z.ONE);
  }
}
