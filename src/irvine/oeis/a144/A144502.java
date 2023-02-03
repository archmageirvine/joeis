package irvine.oeis.a144;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144502 Square array read by antidiagonals upwards: T(n,k) is the number of scenarios for the gift exchange problem in which each gift can be stolen at most once, when there are n gifts in the pool and k gifts (not yet frozen) in peoples' hands.
 * @author Georg Fischer
 */
public class A144502 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144502() {
    super(0, 0, 1);
    hasRAM(true);
  }

  /* Maple:
    B:=proc(p,r) option remember;
    if p=0 then RETURN(1); fi;
    if r=0 then RETURN(B(p-1, 1)); fi;
    B(p-1,r+1)+r*B(p,r-1); end;
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int p, final int r) {
      if (p == 0) {
        return Z.ONE;
      }
      if (r == 0) {
        return get(p - 1, 1);
      }
      return get(p - 1, r + 1).add(get(p, r - 1).multiply(r));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
