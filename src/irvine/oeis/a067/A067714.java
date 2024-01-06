package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a065.A065298;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067714 a(n+1) is the smallest square &gt; a(n) such that the digits of a(n) are all (with multiplicity) properly contained in the digits of a(n+1), with a(0)=4.
 * @author Sean A. Irvine
 */
public class A067714 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067714() {
    super(0, new A065298(), Z::square);
  }
}
