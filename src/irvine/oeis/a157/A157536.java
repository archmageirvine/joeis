package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.memory.FunctionInt3ZSequence;

/**
 * A157536 Half the number of length n integer sequences with sum zero and sum of squares 32.
 * Pattern for similar sequences, rewritten from Maple.
 * @author Georg Fischer
 */
public class A157536 extends FunctionInt3ZSequence {

  protected int mS; // sum of terms
  protected int mSs; // sum of squares of terms
  protected int mN;

  /** Construct the sequence. */
  public A157536() {
    this(2, 0, 32);
  }

  /**
   * Constructor with parameters.
   * @param s sum of terms
   * @param ss sum of squares of terms
   */
  public A157536(final int offset, final int s, final int ss) {
    super(offset);
    mN = offset - 1;
    mS = s;
    mSs = ss;
  }

  /* Maple program:
     g:= proc(n, s, ss) option remember;
        if n = 1 then if ss = s^2 then return 1 else return 0 fi fi;
        procname(n-1, s, ss)
        + add( procname(n-1, s-t, ss-t^2)
             + procname(n-1, s+t, ss-t^2)
             , t = 1..floor(sqrt(ss))
             );
     end proc:
     seq(g(n, 0, 32)/2, n=2..50); # Robert Israel, Dec 25 2016
  */
  @Override
  protected Z compute(final int n, final int s, final int ss) {
    if (n == 1) {
      return ss == s * s ? Z.ONE : Z.ZERO;
    }
    Z result = get(n - 1, s, ss);
    int t = 1;
    int tt = 1;
    while (tt <= ss) {
      result = result.add(get(n - 1, s - t, ss - tt))
                     .add(get(n - 1, s + t, ss - tt));
      ++t;
      tt = t * t;
    }
    return result;
  }

  @Override
  public Z next() {
    return get(++mN, mS, mSs).divide2();
  }

}
