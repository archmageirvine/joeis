package irvine.oeis.a328;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a333.A333330;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A328682 Array read by antidiagonals: T(n,r) is the number of connected r-regular loopless multigraphs on n unlabeled nodes.
 * @author Gregory Morse
 */
public class A328682 extends A333330 {
  protected A328682(final boolean loops) {
    super(loops, false);
  }

  /** Construct the sequence. */
  public A328682() {
    this(false);
  }

  private final MemoryFunction1<DirectSequence> mConnected = new MemoryFunction1<>() {
    @Override
    protected DirectSequence compute(final int k) {
      return DirectSequence.create(new InverseEulerTransform(0, new Sequence1() {
        private int mN = 0;

        @Override
        public Z next() {
          return regular(++mN, k);
        }
      }, 0, Z.ONE));
    }
  };

  @Override
  protected Z t(final int n, final int k) {
    return mConnected.get(k).a(n);
  }
}
