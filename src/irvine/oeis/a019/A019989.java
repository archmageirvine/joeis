package irvine.oeis.a019;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019989 A threequence, a 3-way partitioning of the integers: define a,b,c,A,B,C by a(0)=true, b(0)=c(0)=A(0)=B(0)=C(0)=false, a(n)=a(m) OR C(m) OR B(m), b(n)= b(m) OR A(m) OR C(m), c(n)= c(m) OR B(m) OR A(m), A(n)= A(m) OR b(m) OR c(m), B(n)= B(m) OR c(m) OR a(m), C(n)= C(m) OR a(m) OR b(m), where m = [ (n+1)/3 ]; sequence gives n such that a(2n) is true.
 * @author Sean A. Irvine
 */
public class A019989 implements Sequence {

  /*
   a(0)=true,
   b(0)=c(0)=A(0)=B(0)=C(0)=false,
   a(n)=a(m) OR C(m) OR B(m),
   b(n)= b(m) OR A(m) OR C(m),
   c(n)= c(m) OR B(m) OR A(m),
   A(n)= A(m) OR b(m) OR c(m),
   B(n)= B(m) OR c(m) OR a(m),
   C(n)= C(m) OR a(m) OR b(m),
   where m = [ (n+1)/3 ]; sequence gives n such that a(2n) is true
   */

  // todo not yet working -- should this be XOR? -- that doesn't work either
  // also tried some combs of || and &&
  // maybe big vars are supposed to be complements? -- nope -- or least not in a simple way, also not a(0)


  private final MemoryFunction1<Boolean> mA = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      final Boolean res = n == 0 ? Boolean.TRUE : Boolean.valueOf(get(m) || mBigB.get(m) || mBigC.get(m));
      //System.out.println(n + " " + res);
      return res;
    }
  };

  private final MemoryFunction1<Boolean> mB = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      return n == 0 ? Boolean.FALSE : Boolean.valueOf(get(m) || mBigA.get(m) || mBigC.get(m));
    }
  };

  private final MemoryFunction1<Boolean> mC = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      return n == 0 ? Boolean.FALSE : Boolean.valueOf(get(m) || mBigA.get(m) || mBigB.get(m));
    }
  };

  private final MemoryFunction1<Boolean> mBigA = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      return n == 0 ? Boolean.FALSE : Boolean.valueOf(get(m) || mB.get(m) || mC.get(m));
    }
  };

  private final MemoryFunction1<Boolean> mBigB = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      return n == 0 ? Boolean.FALSE : Boolean.valueOf(get(m) || mA.get(m) || mC.get(m));
    }
  };

  private final MemoryFunction1<Boolean> mBigC = new MemoryFunction1<Boolean>() {
    @Override
    protected Boolean compute(final int n) {
      final int m = (n + 1) / 3;
      return n == 0 ? Boolean.FALSE : Boolean.valueOf(get(m) || mA.get(m) || mB.get(m));
    }
  };

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      //System.out.println(mA.get(mN) + " " + mB.get(mN) + " " + mC.get(mN) + " " + mBigA.get(mN) + " " + mBigB.get(mN) + " " + mBigC.get(mN));
      //++mN;
      mN += 2;
      if (mA.get(mN)) {
        return Z.valueOf(mN / 2);
      }
    }
  }
}
