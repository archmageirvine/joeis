package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a065.A065297;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067711 a(n+1) is the smallest square &gt; a(n) such that the digits of a(n) are all (with multiplicity) properly contained in the digits of a(n+1), with a(0)=1.
 * @author Sean A. Irvine
 */
public class A067711 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067711() {
    super(0, new A065297(), Z::square);
  }
}
