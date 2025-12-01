package irvine.oeis.a359;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A359405 Number of unordered pairs of self-avoiding paths with nodes that cover all vertices of a convex n-gon; one-node paths are allowed.
 * @author Georg Fischer
 */
public class A359405 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A359405() {
    super(1, "[0,0,1,-15,93,-308,594,-648,288]", "[1,-18,132,-504,1056,-1152,512]");
  }
}
