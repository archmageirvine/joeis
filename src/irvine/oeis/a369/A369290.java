package irvine.oeis.a369;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a123.A123551;

/**
 * A369290 Number of unlabeled simple graphs without endpoints with n edges.
 * @author Gregory Morse
 */
public class A369290 extends Sequence0 {
  private final A123551 mGraphs;
  private int mN = -1;

  protected A369290(final A123551 graphs) {
    mGraphs = graphs;
  }

  /** Construct the sequence. */
  public A369290() {
    this(new A123551());
  }

  @Override
  public Z next() {
    // After discarding isolates, the minimum degree is two.
    return mGraphs.endpointFree(++mN, mN).coeff(mN);
  }
}
