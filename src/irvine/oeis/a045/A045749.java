package irvine.oeis.a045;

/**
 * A045749 Extension of Beatty sequence; complement of A045750.
 * @author Sean A. Irvine
 */
public class A045749 extends A045671 {

  @Override
  protected long multiplier1() {
    return 3;
  }

  @Override
  protected long multiplier2() {
    return 1;
  }
}
