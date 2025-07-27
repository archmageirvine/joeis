package irvine.oeis.a078;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078979 a(n) = A078711(n) - 1.
 * @author Sean A. Irvine
 */
public class A078979 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078979() {
    super(1, new A078711(), k -> k.subtract(1));
  }
}
