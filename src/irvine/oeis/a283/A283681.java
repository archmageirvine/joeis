package irvine.oeis.a283;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A283682 Unique sequence with a(1)=1, a(2)=2, representing an array read by antidiagonals in which
 * the i-th row is this sequence itself multiplied by i.
 * @author Georg Fischer
 */
public class A283681 extends UpperLeftTriangle {

  private final ArrayList<Z> mArr = new ArrayList<>(128);
  private int mCol;

  /** Construct the sequence. */
  public A283681() {
    super(1, 0, 0, -1);
    hasRAM(true);
    mArr.add(Z.ONE); // [0]
    mArr.add(Z.TWO); // [1]
    mArr.add(Z.TWO); // [2]
    mCol = mArr.size() - 1;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    int last = mArr.size() - 1;
    while (last < k || last < n) {
//**  System.out.print("last=" + last);
      for (int i = mCol; i >= 0; --i) { // falling antidiagonals
//**    System.out.print(", get[" + i + "]=" + mArr.get(i).multiply(mCol - i + 1));
        mArr.add(mArr.get(i).multiply(mCol - i + 1));
      }
      ++mCol;
//**  System.out.println("; mCol=" + mCol);
//**  for (int i = 0; i < mArr.size(); ++i) {
//**    System.out.print(mArr.get(i) + ", ");
//**  }
//**  System.out.println("last=" + String.valueOf(mArr.size() - 1));
      last = mArr.size() - 1;
    }
    return mArr.get(k).multiply(n + 1);
  }
}
