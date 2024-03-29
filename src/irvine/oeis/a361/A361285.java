package irvine.oeis.a361;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 13:33

import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A361285 Number of unordered triples of self-avoiding paths whose sets of nodes are disjoint subsets of a set of n points on a circle; one-node paths are allowed.
 * a(n) = (n*(n-1)*(n-2)/384) * (7^(n-3) + 9*5^(n-3) + 3^n + 27)
 * @author Georg Fischer
 */
public class A361285 extends LambdaSequence {

  /** Construct the sequence. */
  public A361285() {
    super(1, n -> new Q(n).multiply(new Q(n - 1)).multiply(new Q(n - 2)).divide(new Q(384)).multiply(Q.SEVEN.pow(n - 3).add(Q.NINE.multiply(Q.FIVE.pow(n - 3))).add(Q.THREE.pow(n)).add(new Q(27))).num());
  }
}
