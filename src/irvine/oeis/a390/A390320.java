package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a373.A373387;

/**
 * A390320 allocated for Gabriele Di Pietro.
 * @author Sean A. Irvine
 */
public class A390320 extends Sequence1 {

  private final DirectSequence mA = new A373387();
  private int mN = 1;

  /*
  from sympy import factorint

def upto(n):

 s=[]

 for k in range(2, n+1):

  if k%10==0:

   continue

  Vk=A373387(k)

  if Vk is None:

   continue

  minVp=None

  for p, e in factorint(k).items():

   Vp=A373387(p)

   if Vp is not None:

    if minVp is None or Vp<minVp:

     minVp=Vp

  if minVp is not None and Vk>minVp:

     s.append(k)

  return s

print(upto(10000))
   */

  private boolean is(final int n) {
    if (n % 10 == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (mA.a(p).compareTo(cs) >= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

