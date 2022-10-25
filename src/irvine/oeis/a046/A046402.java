package irvine.oeis.a046;

/**
 * A046402 Numbers with exactly 4 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046402 extends A046401 {

  {
    setOffset(0);
  }

  @Override
  protected int targetOmega() {
    return 4;
  }
}
