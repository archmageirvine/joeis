package irvine.oeis.a345;

import irvine.math.graph.UnlabeledAcyclicDigraphs;
import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A345258 Number of acyclic digraphs (or DAGs) on n unlabeled vertices with one source and one sink.
 * @author Gregory Morse
 */
public class A345258 extends Sequence1 {
  private final UnlabeledAcyclicDigraphs mDags = new UnlabeledAcyclicDigraphs(false);
  private int mN = 0;

  @Override
  public Z next() {
    return mDags.row(++mN, Kind.SOURCE_SINK).coeff(0).toZ();
  }
}
