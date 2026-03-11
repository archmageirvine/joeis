package irvine.oeis.a046;

import irvine.oeis.a270.A270248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A046159 Bends of spheres in the plane of Soddy's bowl of integers.
 * @author Sean A. Irvine
 */
public class A046159 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A046159() {
    super(1, new A270248().skip(), k -> k.subtract(1));
  }
}

