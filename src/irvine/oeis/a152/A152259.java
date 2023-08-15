package irvine.oeis.a152;

import irvine.oeis.UnionSequence;
import irvine.oeis.a147.A147568;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A152259 Union of values: A147568(n) and 2*A147568(n) - 1.
 * @author Sean A. Irvine
 */
public class A152259 extends UnionSequence {

  /** Construct the sequence. */
  public A152259() {
    super(1, new A147568(), new SimpleTransformSequence(new A147568(), k -> k.multiply2().subtract(1)));
  }
}
