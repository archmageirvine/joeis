package irvine.oeis.a226;
// manually (core) 2020-11-16

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A226898 Hooley's Delta function: maximum number of divisors of n in [u, eu] for all u. (Here e is Euler's number 2.718... = A001113.)
 * @author Georg Fischer
 */
public class A226898 implements Sequence {

  protected int mN; // current index/offset
  private static final Z EP10 = Z.valueOf(2718281828L);
  private static final Z MP10 = Z.valueOf(1000000000L);
  
  /** Construct the sequence. */
  public A226898() {
    mN = 0; // offset = 1
  }
  
  @Override
  public Z next() {
    int maxCount = 0;
    final FactorSequence fs = Cheetah.factor(++mN);
    final Z[] divs = fs.divisorsSorted();
    for (int i1 = 0; i1 < divs.length; ++i1) {
      final Z div1 = divs[i1];
      final Z limit = div1.multiply(EP10).divide(MP10);
      int count2 = 0;
      for (int i2 = i1; i2 < divs.length; ++i2) {
        final Z div2 = divs[i2];
        if (div2.compareTo(limit) <= 0) {
          ++count2;
        }
      } // for i2
      if (count2 > maxCount) {
        maxCount = count2;
      }
    } // for i1
    return Z.valueOf(maxCount);
  }
}
