package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014710 The regular paper-folding (or dragon curve) sequence. Alphabet {2,1}.
 * @author Sean A. Irvine
 */
public class A014710 extends A014577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

