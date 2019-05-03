package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014710 The regular <code>paper-folding</code> (or dragon curve) sequence.
 * @author Sean A. Irvine
 */
public class A014710 extends A014577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

