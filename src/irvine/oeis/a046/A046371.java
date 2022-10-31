package irvine.oeis.a046;

/**
 * A046371 Numbers with exactly 5 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046371 extends A046369 {

  @Override
  protected int targetOmega() {
    return 5;
  }
}
