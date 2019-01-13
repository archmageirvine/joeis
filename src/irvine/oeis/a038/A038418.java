package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038418.
 * @author Sean A. Irvine
 */
public class A038418 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038418() {
    super(
      new long[] {1, 4, 10, 19, 35, 54, 77, 107, 142, 164, 196, 235, 263, 292, 305, 319, 363, 352, 341, 336, 351, 365, 332, 266, 245, 235, 168, 25, -93, -199, -309, -492, -718, -932, -1054, -1284, -1559, -1730, -1961, -2114, -2308, -2593, -2705, -2784, -2966, -3096, -3193, -3175, -3148, -3075, -3070, -2874, -2505, -2197, -1946, -1388, -962, -237, 466, 1033, 1785, 2821, 3538, 4517, 5331, 6334, 7261, 8404, 9081, 10064, 11108, 11944, 12484, 13370, 13715, 14478, 14744, 14658, 14603, 14778, 14263, 13625, 12756, 11824, 10652, 9540, 7510, 5730, 4040, 1617, -754, -3131, -6115, -8732, -11645, -14871, -17702, -20823, -23949, -27155, -29655, -32675, -35291, -37701, -39946, -41997, -42867, -45096, -45385, -46081, -46038, -45771, -44508, -43782, -41292, -39359, -35927, -33030, -28270, -24769, -19348, -13934, -8009, -2416, 4819, 10462, 18625, 25177, 32480, 39381, 47335, 53853, 61422, 67569, 74506, 79963, 86360, 90531, 95339, 99138, 101742, 103932, 105549, 105460, 105347, 103655, 100839, 97865, 93033, 87972, 80989, 74157, 65338, 56701, 46431, 36024, 23942, 12973, -850, -12361, -26640, -39292, -53627, -66129, -80549, -91877, -106208, -116795, -129795, -138596, -149947, -157154, -166527, -171588, -178268, -180347, -184889, -183908, -185435, -181906, -179425, -173086, -167715, -158259, -150298, -137528, -126129, -111413, -97691, -81105, -64687, -45905, -27964, -8718, 9976, 30573, 50202, 70246, 89780, 108143, 127623, 145306, 162541, 178219, 193380, 205715, 219452, 228501, 238735, 244177, 250843, 252480, 255944, 253588, 252457, 245954, 241848, 230506, 223193, 208510, 196265, 178947, 163796, 142860, 126230, 102208, 82544, 57778, 37249, 11100, -10512, -36769, -58879, -83608, -104261, -129491, -148068, -170495, -188171, -206253, -221708, -237516, -248503, -260742, -268371, -275756, -279682, -283014, -282888, -280808, -277549, -270470, -262726, -253141, -240374, -226343, -211677, -192655, -176223, -154834, -134844, -111562, -90154, -65554, -43519, -17956, 4554, 30624, 50746, 76452, 96349, 119308, 138418, 158321, 173745, 192766, 204336, 219766, 228467, 239296, 244550, 251661, 253302, 255875, 253596, 252529, 245406, 241738, 231218, 222500, 210263, 197321, 182372, 168213, 149880, 133315, 113668, 95573, 75789, 56294, 36184, 15667, -3035, -22297, -41413, -58995, -76810, -93154, -107298, -122709, -134461, -146962, -156415, -165327, -172040, -178051, -181678, -185035, -184588, -185436, -181735, -179705, -174013, -168334, -160364, -152493, -142073, -133228, -120224, -109925, -96089, -84143, -70359, -57437, -43356, -30553, -16326, -4302, 9315, 20443, 33138, 43606, 53814, 63284, 71841, 79304, 86792, 91526, 96987, 100527, 103326, 105192, 105965, 105850, 104885, 102901, 100276, 96547, 92785, 87662, 82020, 76631, 69644, 63550, 56470, 48996, 41902, 34768, 27240, 20431, 12930, 6282, -514, -6241, -12614, -18015, -23015, -27878, -31841, -35064, -38909, -41029, -43226, -44778, -45606, -46179, -46630, -45987, -45087, -43946, -42671, -40527, -38786, -36111, -33363, -31050, -27946, -24726, -22066, -18677, -15597, -12714, -9589, -6738, -4149, -1320, 1278, 3187, 5257, 7384, 8956, 10546, 11663, 12464, 13659, 14438, 14547, 14782, 14918, 14854, 14645, 14193, 13375, 12969, 12365, 11277, 10451, 9575, 8480, 7726, 6664, 5615, 4733, 3889, 2901, 2111, 1318, 501, -147, -625, -1426, -1804, -2149, -2587, -2801, -2975, -3277, -3161, -3195, -3288, -3197, -3021, -2917, -2772, -2617, -2459, -2210, -1940, -1889, -1630, -1314, -1164, -946, -781, -595, -340, -192, -136, -6, 166, 233, 252, 317, 317, 382, 381, 360, 348, 390, 342, 351, 330, 303, 261, 253, 205, 193, 146, 116, 71, 89, 33, 10, 11, 3, -5, 3, -16, 3, 0, -3, -15, 1, -4, -2, -7, -1, -2, 6, -5, -2, 1, 4, 1, 0, -2, 2, 2, 1, 0, -1, 1, 1},
      new int[] {7, 11, 19, 20, 23, 24, 25, 27, 29, 30, 32, 34, 36, 40, 42, 44, 52});
  }
}
