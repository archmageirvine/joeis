package irvine.oeis.a032;

/**
 * A032786 Numbers k such that k(k+1)(k+2)...(k+15) / (k+(k+1)+(k+2)+...+(k+15)) is an integer.
 * @author Sean A. Irvine
 */
public class A032786 extends A032785 {

  @Override
  protected long t() {
    return 15;
  }
}

