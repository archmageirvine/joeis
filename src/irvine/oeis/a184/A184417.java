package irvine.oeis.a184;

import irvine.oeis.a001.A001359;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A184417 p^2 + (p+2)^2 - 1 where (p,p+2) is the n-th twin prime pair.
 * @author Sean A. Irvine
 */
public class A184417 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A184417() {
    super(1, new A001359(), p -> p.square().add(p.add(2).square()).subtract(1));
  }
}
