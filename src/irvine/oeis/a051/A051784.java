package irvine.oeis.a051;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.StirlingBernoulliTransform;
import irvine.oeis.a000.A000081;

/**
 * A051784 Apply the "Stirling-Bernoulli transform" to A000081 = (1,1,1,2,4,9,20,...), rooted trees.
 * @author Sean A. Irvine
 */
public class A051784 extends StirlingBernoulliTransform {

  /** Construct the sequence. */
  public A051784() {
    super(new PrependSequence(new SkipSequence(new A000081(), 1), 1));
  }
}
