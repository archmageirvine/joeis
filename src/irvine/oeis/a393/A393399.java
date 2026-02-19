package irvine.oeis.a393;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393399 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A393399 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private final ArrayList<FactorSequence> mFactorSequences = new ArrayList<>();
  {
    mFactorSequences.add(null); // 0 not used
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mFactorSequences.add(Jaguar.factor(mF));
    mFactorSequences.get(mN).lock(); // safety
    long count = 0;
    final FactorSequence fs = new FactorSequence(mFactorSequences.get(mN)); // use a copy
    Z p = fs.largestPrimeFactor();
    for (int d = mN - 1; d > 0; --d) {
      final FactorSequence fsD = mFactorSequences.get(d);
      final Z lpfD = fsD.largestPrimeFactor();
      if (lpfD.compareTo(p) < 0 && (fs.getExponent(p) & 1) == 1) {
        // We can never form a square because the valuation of p is currently odd,
        // and prime p will never occur in a smaller term
        break;
      }
      final FactorSequence fs1 = new FactorSequence(fs).merge(fsD);
      for (int c = d - 1; c > 0; --c) {
        final FactorSequence fsC = mFactorSequences.get(c);
        final Z lpfC = fsC.largestPrimeFactor();
        if (lpfC.compareTo(lpfD) < 0 && (fs1.getExponent(lpfD) & 1) == 1) {
          break;
        }
        final FactorSequence fs2 = new FactorSequence(fs1).merge(fsC);
        for (int b = c - 1; b > 0; --b) {
          final FactorSequence fsB = mFactorSequences.get(b);
          final Z lpfB = fsB.largestPrimeFactor();
          if (lpfB.compareTo(lpfC) < 0 && (fs2.getExponent(lpfC) & 1) == 1) {
            break;
          }
          final FactorSequence fs3 = new FactorSequence(fs2).merge(fsB);
          for (int a = b - 1; a > 0; --a) {
            final FactorSequence fsA = mFactorSequences.get(a);
            final Z lpfA = fsA.largestPrimeFactor();
            if (lpfA.compareTo(lpfB) < 0 && (fs3.getExponent(lpfB) & 1) == 1) {
              break;
            }
            final FactorSequence fs4 = new FactorSequence(fs3).merge(fsA);
            // Check exponents all even (we actually already know > lpfA are)
            boolean ok = true;
            for (final Z q : fs.toZArray()) {
              if ((fs4.getExponent(q) & 1) == 1) {
                ok = false;
                break;
              }
            }
            if (ok) {
              ++count;
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
