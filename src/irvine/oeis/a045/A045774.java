package irvine.oeis.a045;

/**
 * A045774 Extension of Beatty sequence; complement of A045775.
 * @author Sean A. Irvine
 */
public class A045774 extends A045671 {

  @Override
  protected long multiplier1() {
    return 3;
  }

  @Override
  protected long multiplier2() {
    return 2;
  }
}
