package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067717 a(n+1) is the smallest square &gt; a(n) such that the digits of a(n) are all (with multiplicity) contained in the digits of a(n+1), with a(0)=4.
 * @author Sean A. Irvine
 */
public class A067717 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067717() {
    super(0, new A067975(), Z::square);
  }
}
