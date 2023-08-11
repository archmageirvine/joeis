package irvine.oeis.a240;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2Array;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A240608 Number A(n,k) of n-length words w over a k-ary alphabet such that w is empty or a prefix z concatenated with letter a_i and i=1 or 0 &lt; #(z,a_{i-1}) &gt;= #(z,a_i), where #(z,a_i) counts the occurrences of the i-th letter in z; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A240608 extends UpperLeftTriangle {

  {
    hasRAM(true);
  }

//   Maple:
//    b:= proc(n, k, l) option remember;
//       printf("# %a,%a,%a\n", n,k,l);
//      `if`(n=0, 1, `if`(nops(l)<k,
//          b(n-1, k, [l[], 1]), 0) +add(`if`(i=1 or l[i]<=l[i-1],
//          b(n-1, k, subsop(i=l[i]+1, l)), 0), i=1..nops(l)))
//        end:
//    A:= (n, k)-> b(n, min(k, n), []):
//    seq(seq(A(n, d-n), n=0..d), d=0..6);
  private final MemoryFunctionInt2Array<Z> mB = new MemoryFunctionInt2Array<>() {
  @Override
  protected Z compute(final int n, final int k, final int[] list) {
    // System.out.println("# " + n + "," + k + "," + IntegerUtils.toString(list));
    if (n == 0) {
      return Z.ONE;
    }
    final int len = list.length;
    Z sum = Z.ZERO;
    if (len < k) {
      final int[] list2 = Arrays.copyOf(list, len + 1);
      System.arraycopy(list, 0, list2, 0, len);
      list2[len] = 1;
      sum = get(n - 1, k, list2);
    }
    for (int i = 0; i < len; ++i) {
      if (i == 0 || list[i] <= list[i - 1]) {
        final int[] list2 = new int[len];
        for (int j = 0; j < len; ++j) {
          list2[j] = j == i ? list[j] + 1 : list[j];
        }
        sum = sum.add(get(n - 1, k, list2));
      }
    }
    return sum;
  }
};

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, Math.min(k, n), new int[0]);
  }
}
