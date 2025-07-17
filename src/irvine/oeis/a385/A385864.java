package irvine.oeis.a385;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.IndependencePolynomial;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A385864 allocated for Soham Samanta.
 * @author Sean A. Irvine
 */
public class A385864 extends ParallelGenerateGraphsSequence {

  private static final Set<Polynomial<Z>> SEEN = Collections.synchronizedSet(new HashSet<>());
  private static final Set<Polynomial<Z>> DUPES = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A385864() {
    super(1, 0, 1, 0, () -> graph -> {
      final Polynomial<Z> ip = IndependencePolynomial.getPolynomial(graph);
      //System.out.println(graph + " -> " + ip);
      if (SEEN.add(ip)) {
        return 1; // First time we saw this polynomial
      } else if (DUPES.add(ip)) {
        return -1; // Previously was unique, now seen again, reduce te overall count
      } else {
        return 0; // Already accounted for
      }
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(0);
  }

  @Override
  public Z next() {
    SEEN.clear();
    DUPES.clear();
    return super.next();
  }
}
