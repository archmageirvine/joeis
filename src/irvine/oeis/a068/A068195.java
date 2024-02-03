package irvine.oeis.a068;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068195 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068195() {
    super(1, new A068194(), k -> k.multiply(k.add(1)).divide2());
  }
}
