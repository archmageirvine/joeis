package irvine.oeis.a003;

/**
 * A003110 a(n) = number of special odd permutations of 2*n+1.
 * @author Sean A. Irvine
 */
public class A003110 extends A003109 {

  protected boolean accept() {
    return !super.accept();
  }
}
