package irvine.oeis.a065;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065751.
 * @author Sean A. Irvine
 */
public class A065751 extends Sequence0 {

  // Grammar matching -- very slow

//  private long mN = 17;
//
//  private boolean is(final String s) {
//    if (s.equals("09")
//      || s.equals("18")
//      || s.equals("27")
//      || s.equals("36")
//      || s.equals("45")
//      || (s.startsWith("1") && s.endsWith("8") && is(s.substring(1, s.length() - 1)))
//      || (s.startsWith("2") && s.endsWith("7") && is(s.substring(1, s.length() - 1)))
//      || (s.startsWith("3") && s.endsWith("6") && is(s.substring(1, s.length() - 1)))
//      || (s.startsWith("4") && s.endsWith("5") && is(s.substring(1, s.length() - 1)))
//      || (s.startsWith("18") && is(s.substring(2)))
//      || (s.startsWith("27") && is(s.substring(2)))
//      || (s.startsWith("36") && is(s.substring(2)))
//      || (s.startsWith("45") && is(s.substring(2)))
//    ) {
//      return true;
//    }
//    for (int k = 2; k < s.length(); k += 2) {
//      if (is(s.substring(0, k)) && is(s.substring(k))) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  @Override
//  public Z next() {
//    while (true) {
//      if (is(String.valueOf(++mN))) {
//        return Z.valueOf(mN);
//      }
//    }
//  }

  // Forward generation

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(s -> s));
  {
    mA.add("09");
    mA.add("18");
    mA.add("27");
    mA.add("36");
    mA.add("45");
  }

  @Override
  public Z next() {
    while (true) {
      final String s = mA.pollFirst();
      mA.add(s + "09");
      mA.add(s + "18");
      mA.add(s + "27");
      mA.add(s + "36");
      mA.add(s + "45");
      mA.add("09" + s);
      mA.add("18" + s);
      mA.add("27" + s);
      mA.add("36" + s);
      mA.add("45" + s);
      mA.add("1" + s + "8");
      mA.add("2" + s + "7");
      mA.add("3" + s + "6");
      mA.add("4" + s + "5");
      if (s.charAt(0) != '0') {
        return new Z(s);
      }
    }
  }
}
