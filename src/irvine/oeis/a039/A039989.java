package irvine.oeis.a039;

/**
 * A039989 k th digit of a(n) is the number of different digits within 3 of k (not including k).
 * @author Sean A. Irvine
 */
public class A039989 extends A039987 {

  @Override
  protected int shift() {
    return 3;
  }
}

