package irvine.oeis.a064;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005231;

/**
 * A064001.
 * @author Sean A. Irvine
 */
public class A064001 extends FilterSequence {

  /** Construct the sequence. */
  public A064001() {
    super(new A005231(), k -> k.mod(5) != 0);
  }
}
