package irvine.oeis.a283;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A283682 Unique sequence with a(1)=0, a(2)=1, representing an array T(i,j) read by antidiagonals in which T(i,j) = a(i) + a(j).
 * @author Georg Fischer
 */
public class A283682 extends UpperLeftTriangle {

  private final ArrayList<Z> mArr = new ArrayList<>(128);
  private int mCol;

  /** Construct the sequence. */
  public A283682() {
    super(1, 0, 0, -1);
    hasRAM(true);
    mArr.add(Z.ZERO); // [0]
    mArr.add(Z.ONE);  // [1]
    mArr.add(Z.ONE);  // [2]
    mCol = mArr.size() - 1;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    int last = mArr.size() - 1;
    while (last < k || last < n) {
      //System.out.print("last=" + last);
      for (int i = mCol; i >= 0; --i) { // falling antidiagonals
        //System.out.print(", get[" + i + "]=" + mArr.get(i).add(mArr.get(mCol - i)));
        mArr.add(mArr.get(i).add(mArr.get(mCol - i)));
      }
      ++mCol;
//      System.out.println("; mCol=" + mCol);
//      for (int i = 0; i < mArr.size(); ++i) {
//        System.out.print(mArr.get(i) + ", ");
//      }
//      System.out.println("last=" + String.valueOf(mArr.size() - 1));
      last = mArr.size() - 1;
    }
    return mArr.get(n).add(mArr.get(k));
  }
}
