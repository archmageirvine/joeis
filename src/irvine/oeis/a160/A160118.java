package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A160118 Number of "ON" cells at n-th stage in simple 2-dimensional cellular automaton (see Comments for precise definition).
 * @author Sean A. Irvine
 */
public class A160118 implements Sequence {

  private static final long[] DX = {0, 0, 1, 1, 1, -1, -1, -1};
  private static final long[] DY = {1, -1, 0, 1, -1, 0, 1, -1};

  private HashSet<String> mOn = null;
  private boolean mEven = false;

  /*
  private void dump() {
    long max = 0;
    for (final String s : mOn) {
      final long x = Long.parseLong(s.substring(s.indexOf('_') + 1));
      if (x > max) {
        max = x;
      }
    }
    for (long y = -max; y <= max; ++y) {
      for (long x = -max; x <= max; ++x) {
        final String g = y + "_" + x;
        if (mOn.contains("." + g)) {
          System.out.print("#");
        } else if (mOn.contains("*" + g)) {
          System.out.print("*");
        } else {
          System.out.print(".");
        }
      }
      System.out.println();
    }
    System.out.println("Total ON: " + mOn.size());
  }
  */

  @Override
  public Z next() {
    if (mOn == null) {
      mOn = new HashSet<>();
    } else if (mOn.isEmpty()) {
      mOn.add(".0_0");
    } else {
      mEven = !mEven;
      final HashSet<String> nextStep = new HashSet<>(mOn.size() * 4);
      for (final String k : mOn) {
        nextStep.add("*" + k.substring(1));
      }
      //      nextStep.addAll(mOn);
      if (mEven) {
        for (final String k : mOn) {
          if (k.charAt(0) == '.') {
            final int underscore = k.indexOf('_');
            final long x = Long.parseLong(k.substring(1, underscore));
            final long y = Long.parseLong(k.substring(underscore + 1));
            for (int j = 0; j < DX.length; ++j) {
              final String g = (x + DX[j]) + "_" + (y + DY[j]);
              if (!nextStep.contains("*" + g)) {
                nextStep.add("." + g);
              }
            }
          }
        }
      } else {
        for (final String k : mOn) {
          if (k.charAt(0) == '.') {
            // find peninsula cells
            final int underscore = k.indexOf('_');
            final long x = Long.parseLong(k.substring(1, underscore));
            final long y = Long.parseLong(k.substring(underscore + 1));
            for (int j = 0; j < DX.length; ++j) {
              final long dx = x + DX[j];
              final long dy = y + DY[j];
              final String key = dx + "_" + dy;
              if (!mOn.contains("." + key) && !mOn.contains("*" + key)) {
                int c = 0;
                for (int i = 0; i < DX.length; ++i) {
                  final String g = (dx + DX[i]) + "_" + (dy + DY[i]);
                  if (mOn.contains("." + g) || mOn.contains("*" + g)) {
                    ++c;
                  }
                }
                if (c == 1) {
                  nextStep.add("." + key);
                }
              }
            }
          }
        }
      }
      mOn = nextStep;
    }
    //    dump();
    return Z.valueOf(mOn.size());
  }
}

