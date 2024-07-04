package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a079.A079436;

/**
 * A071153 \u0141ukasiewicz word for each rooted plane tree (interpretation e in Stanley's exercise 19) encoded by A014486 (or A063171), with the last leaf implicit, i.e., these words are given without the last trailing zero, except for the null tree which is encoded as 0.
 * @author Sean A. Irvine
 */
public class A071153 extends A079436 {

  @Override
  public Z next() {
    return super.next().divide(10);
  }
}
