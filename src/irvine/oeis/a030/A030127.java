package irvine.oeis.a030;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030127 Term at which n-Somos sequence first becomes nonintegral.
 * @author Sean A. Irvine
 */
public class A030127 extends AbstractSequence {

  /* Construct the sequence. */
  public A030127() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    ++mN;
    final List<Q> somos = new ArrayList<>();
    int k = -1;
    while (++k < mN) {
      somos.add(Q.ONE);
    }
    do {
      Q sum = Q.ZERO;
      for (int j = 1; j <= mN / 2; ++j) {
        sum = sum.add(somos.get(k - j).multiply(somos.get(k - mN + j)));
      }
      somos.add(sum.divide(somos.get(k - mN)));
      ++k;
    } while (somos.get(somos.size() - 1).isInteger());
    return Z.valueOf(somos.size() - 1);
  }
}
